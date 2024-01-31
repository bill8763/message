/**
 * 
 */
package com.bill.message.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bill.message.model.SendMessageRequest;
import com.bill.message.model.StatusInfo;

/** 
* @ClassName: MessageService 
* @Description: 
* @author bill8
* @date 2024/1/31 下午 09:27:26 
*  
*/
@Service
public class MessageService {

	@Autowired
	private MessageSenderProvider messageSenderProvider;
	/** 
	* @throws Exception 
	 * @Title: sendMessage 
	* @Description: 
	*/
	public ResponseEntity<StatusInfo> sendMessage(String authorization, SendMessageRequest body) throws Exception {

		MessageSender messageSender = messageSenderProvider
				.getMessageSender(Enum.valueOf(MessagePlatform.class, body.getPlatform()));
		//TODO send impl
		String response = messageSender.sendMessage(body);
		StatusInfo statusInfo = new StatusInfo();
		statusInfo.status("success");
		return new ResponseEntity<StatusInfo> (statusInfo, HttpStatus.OK);

	}
}
