/*
 * Copyright 2016-2017 Tom Misawa, riversun.org@gmail.com
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of 
 * this software and associated documentation files (the "Software"), to deal in the 
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 *  INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR 
 * IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 */
package org.example.wcs;

import java.util.List;
import java.util.Map;

import org.riversun.wcs.WcsClient;

import com.ibm.watson.developer_cloud.conversation.v1.model.Entity;
import com.ibm.watson.developer_cloud.conversation.v1.model.Intent;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

/**
 * Java Example for Watson Conversation<br>
 * - Handle Watson's response details from Java program<br>
 * <br>
 * -How to run<br>
 * Download workspace file for Watson conversation from here.<br>
 * https://riversun.github.io/wcs/org.riversun.WcsContextTest.zip<br>
 * Import this workspace into Watson Conversation and set
 * username,password,workspaceId<br>
 * 
 */
public class WcsExample03 {

    // EDIT HERE
    private static final String WATSON_CONVERSATION_USERNAME = "EDIT_ME_USERNAME_HERE";
    private static final String WATSON_CONVERSATION_PASSWORD = "EDIT_ME_PASSWORD_HERE";
    private static final String WATCON_CONVERSATION_WORKSPACE_ID = "EDIT_ME_WORKSPACE_ID_HERE";

    public static void main(String[] args)
    {

        String wcsClientId = "dummy_user_id";

        WcsClient watson = new WcsClient(
                WATSON_CONVERSATION_USERNAME,
                WATSON_CONVERSATION_PASSWORD,
                WATCON_CONVERSATION_WORKSPACE_ID);

        MessageResponse res = watson.startConversation(wcsClientId);
        Map<String, Object> context = res.getContext();

        Map<String, Object> input = res.getInput();

        String inputText = res.getInputText();

        List<Intent> intents = res.getIntents();

        List<Entity> entities = res.getEntities();

        Map<String, Object> output = res.getOutput();

        List<String> text = res.getText();

        String textConcatenated = res.getTextConcatenated("");

        System.out.println("Response JSON from Watson=\n" + res.toString());

    }
}
