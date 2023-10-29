class ChatUser implements Observer {
    private String username;

    public ChatUser(String username) {
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println(username + " received a message from: " + message);
    }
}