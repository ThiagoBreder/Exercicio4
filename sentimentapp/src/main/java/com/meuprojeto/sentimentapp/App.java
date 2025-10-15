package com.meuprojeto.sentimentapp;

import com.azure.ai.textanalytics.*;
import com.azure.ai.textanalytics.models.*;
import com.azure.core.credential.AzureKeyCredential;

public class App {
    public static void main(String[] args) {
        // 🔑 Minhas credenciais do portal Azure
        String endpoint = "https://iaanalisedesentimentostxt.cognitiveservices.azure.com/";
        String key = "35aYdNjadCTwIfkNN1IZjzTH3rXBxwyP9JfvfZtwyT4nLpHSgo4yJQQJ99BJACZoyfiXJ3w3AAAaACOGI3Qm";

        // Cria o cliente do Azure Text Analytics
        TextAnalyticsClient client = new TextAnalyticsClientBuilder()
                .credential(new AzureKeyCredential(key))
                .endpoint(endpoint)
                .buildClient();

        // Exemplo de texto para análise de sentimento
        String texto1 = "Estou muito feliz com o serviço!";
        String texto2 = "Queria que a faculdade fosse mais facil :(";

        // Faz a análise de sentimento (do texto 1)
        DocumentSentiment sentimento1 = client.analyzeSentiment(texto1);
        DocumentSentiment sentimento2 = client.analyzeSentiment(texto2);

        // Exibe o resultado
        System.out.println("Texto: " + texto1);
        System.out.println("Sentimento detectado: " + sentimento1.getSentiment());
        System.out.println("Texto: " + texto2);
        System.out.println("Sentimento detectado: " + sentimento2.getSentiment());
    }
}
