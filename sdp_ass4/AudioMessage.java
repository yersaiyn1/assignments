class AudioMessage extends Message {
    private String audio;

    public AudioMessage(String audio) {
        this.audio = audio;
    }

    @Override
    public void send() {
        System.out.println("Audio Message: " + audio);
    }
}