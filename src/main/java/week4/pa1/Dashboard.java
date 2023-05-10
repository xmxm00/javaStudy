package week4.pa1;

import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class Dashboard {
    public static void main(String[] args) {
        final String oAuthToken = "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";
        GitHub github = null;
        try {
            github = new GitHubBuilder().withOAuthToken(oAuthToken).build();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(github.toString());
    }
}
