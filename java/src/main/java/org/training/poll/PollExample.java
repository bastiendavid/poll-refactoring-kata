package org.training.poll;

import java.util.ArrayList;
import java.util.Arrays;

public class PollExample {

    public static void main(String[] args) {
        PollService pollService = new PollService();
        try {
            pollService.createPoll(0, "What is your favorite color?", new ArrayList<>(Arrays.asList("Blue", "Green", "Red", "Yellow")));
            pollService.vote(0, 0);
            pollService.vote(0, 0);
            pollService.vote(0, 0);
            pollService.vote(0, 3);
            pollService.vote(0, 2);
            pollService.printResults(0);
        } catch (InvalidPollIdException e) {
            e.printStackTrace();
        }
    }
}
