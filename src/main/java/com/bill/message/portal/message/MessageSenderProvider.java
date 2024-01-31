/**
 * 
 */
package com.bill.message.portal.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.message.portal.message.impl.FBMessageSender;
import com.bill.message.portal.message.impl.LineMessageSender;
import com.bill.message.portal.message.impl.WhatsAppMessageSender;

/** 
* @ClassName: MessageSenderProvider 
* @Description: 
* @author bill8
* @date 2024/1/31 下午 09:16:48 
*  
*/
@Service
public class MessageSenderProvider {
	
	@Autowired
	private LineMessageSender lineMessageSender;

	@Autowired
	private FBMessageSender fbMessageSender;

	@Autowired
	private WhatsAppMessageSender whatsAppMessageSender;
	
	
	public MessageSender getMessageSender(MessagePlatform messagePlatform) throws Exception {

		if (MessagePlatform.LINE.equals(messagePlatform)) return lineMessageSender;
		else if (MessagePlatform.FB.equals(messagePlatform)) return fbMessageSender;
		else if (MessagePlatform.WHATSAPP.equals(messagePlatform)) return whatsAppMessageSender;
		else throw new Exception("MessageSender not match");

	}
}
