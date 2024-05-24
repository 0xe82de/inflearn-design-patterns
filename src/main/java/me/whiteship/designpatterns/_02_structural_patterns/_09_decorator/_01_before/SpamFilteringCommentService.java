package me.whiteship.designpatterns._02_structural_patterns._09_decorator._01_before;

public class SpamFilteringCommentService extends CommentService {

    @Override
    public void addComment(String comment) {
        if (!isSpan(comment)) {
            super.addComment(comment);
        }

        super.addComment(comment);
    }

    private boolean isSpan(String comment) {
        return comment.contains("http");
    }
}
