class TextMessage extends Message {
    private String content;

    public TextMessage(String content) {
        this.content = content;
    }

    @Override
    public void send() {
        System.out.println("Text Message: " + content);
    }
}