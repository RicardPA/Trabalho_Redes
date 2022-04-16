package mvc.controle;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.io.*;
import mvc.modelo.Messages;

public class ControllerMessage {
    public static ControllerMessage controladorAlunoSerializado = null;

    public static ControllerMessage getControladorAlunoSerializado(){
        if (controladorAlunoSerializado==null)
            controladorAlunoSerializado = new ControllerMessage();
        return controladorAlunoSerializado;
    }

    HashMap<String, Messages> messages;
    
    private ControllerMessage(){
    	messages = new HashMap<String, Messages>();
    }

    public Messages getMessages(String tagContactString) throws MessagesInexistenteException{
        if (messages.get(tagContactString) == null)
            throw new MessagesInexistenteException();
        else return messages.get(tagContactString);
    }
    
    public void createMessage(String tagContactString, String messageString)throws CreateMessageException{
        if(messages.get(tagContactString) == null){
        	messages.put(tagContactString, new Messages(messageString));
        } else {
        	throw new CreateMessageException();
        }
    }
    
    public Messages removerAluno(String tagContactString) throws MessagesInexistenteException{
        if (messages.remove(tagContactString) == null)
            throw new MessagesInexistenteException();
        else return messages.get(tagContactString);
    }

    public Collection<Messages> getAlunos(){
        return messages.values();
    }

    public void salvarMensagens(String tagContactString)throws IOException{
        FileOutputStream fos = new FileOutputStream("/messages/messages" + tagContactString + ".ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(messages);
        oos.close();
    }

    public void recuperarMensagens() throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alunos.ser"));
        Object objeto = ois.readObject();
        @SuppressWarnings("unchecked")
		HashMap<String, Messages> objeto2 = (HashMap<String, Messages>)objeto;
        messages = objeto2;
        ois.close();
    }

    public void limparMensagens(){
    	messages = new HashMap<String, Messages>();
    }
}