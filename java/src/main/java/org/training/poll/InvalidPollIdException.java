package org.training.poll;

public class InvalidPollIdException extends Throwable {
    public InvalidPollIdException(int id) {
        super("Id of poll is invalid: " + id);
    }
}
