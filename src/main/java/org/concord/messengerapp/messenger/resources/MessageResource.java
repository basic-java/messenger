package org.concord.messengerapp.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.concord.messengerapp.messenger.model.Message;
import org.concord.messengerapp.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageservice =new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage(){
	return messageservice.getAllMessages();
	}
}
