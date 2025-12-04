package ServiceIA;

import java.net.http.*;
import java.net.*;
import java.io.IOException;

public class AiService {

        private static final String API_KEY = "XXXX";

        public String askAi(String prompt) throws IOException, InterruptedException {

                String json = "{"
                                + "\"model\": \"openai/gpt-oss-20b\","
                                + "\"messages\": ["
                                + "    {\"role\": \"user\", \"content\": \"" + escapeJson(prompt) + "\"}"
                                + "]"
                                + "}";

                HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create("https://api.groq.com/openai/v1/chat/completions"))
                                .header("Content-Type", "application/json")
                                .header("Authorization", "Bearer " + API_KEY)
                                .POST(HttpRequest.BodyPublishers.ofString(json))
                                .build();

                HttpClient client = HttpClient.newHttpClient();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                return response.body();
        }

        public static String escapeJson(String s) {
                return s.replace("\\", "\\\\")
                                .replace("\"", "\\\"")
                                .replace("\n", "\\n");
        }

}
