package org.training.poll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PollService {

    private Map<Integer, ArrayList<String>> polls = new HashMap<>();
    private Map<Integer, ArrayList<Integer>> results = new HashMap<>();

    public void createPoll(int id, String question, ArrayList<String> answers) throws InvalidPollIdException {
        if (polls.get(id) != null || results.get(id) != null) {
            throw new InvalidPollIdException(id);
        }
        ArrayList<String> poll = new ArrayList<>();
        poll.add(question);
        poll.addAll(answers);
        polls.put(id, poll);
        results.put(id, new ArrayList<>());
    }

    public void vote(int id, int answer) throws InvalidPollIdException {
        if (results.get(id) == null) {
            throw new InvalidPollIdException(id);
        }
        ArrayList<Integer> poll = results.get(id);
        if (poll == null) {
            throw new InvalidPollIdException(id);
        }
        poll.add(answer);
    }

    public void printResults(int id) throws InvalidPollIdException {
        if (polls.get(id) == null || results.get(id) == null) {
            throw new InvalidPollIdException(id);
        }
        ArrayList<String> poll = polls.get(id);
        ArrayList<Integer> result = results.get(id);
        System.out.println(poll.get(0));
        for (int i = 1; i < poll.size(); ++i) {
            int nbVote = 0;
            for (int r : result) {
                if (r == i - 1) {
                    ++nbVote;
                }
            }
            System.out.println(poll.get(i) + " (" + nbVote + ")");
        }
    }
}
