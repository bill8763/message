/**
 * 
 */
package com.bill.message.message.impl;

import org.springframework.stereotype.Service;

import com.bill.message.message.MessageSender;
import com.bill.message.model.SendMessageRequest;

/** 
* @ClassName: LineMessageSender 
* @Description: 
* @author bill8
* @date 2024/1/31 下午 09:14:32 
*  
*/
@Service
public class LineMessageSender implements MessageSender{

	/*
	* @Title sendMessage
	* @Description  
	* @param request
	* @return 
	* @see com.bill.message.portal.message.MessageSender#sendMessage(com.bill.message.portal.model.SendMessageRequest) 
	*/
	@Override
	public String sendMessage(SendMessageRequest request) {

		// TODO Auto-generated method stub
		return null;

	}
}
