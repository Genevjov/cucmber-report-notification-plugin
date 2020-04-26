package io.genevjov.notifier.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.genevjov.notifier.plugin.model.Notification;
import io.genevjov.notifier.plugin.model.SlackMessage;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SlackSender {

    public void send(Notification notification, String slackWebHook) {

        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(slackWebHook);
        SlackMessage slackMessage = new SlackMessage();
        slackMessage.setText(notification.getMessage());
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(slackMessage);
            StringEntity entity = new StringEntity(json);
            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");
            client.execute(httpPost);
            client.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
