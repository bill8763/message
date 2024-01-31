/**
 * 
 */
package com.bill.message.portal.message;

import com.bill.message.portal.model.SendMessageRequest;

/** 
* @ClassName: MessageSender 
* @Description: 
* @author bill8
* @date 2024/1/31 下午 09:13:31 
*  
*/
public interface MessageSender {
	
	String sendMessage(SendMessageRequest request);
	
}
