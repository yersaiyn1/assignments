class ImageMessage extends Message {
    private String image;

    public ImageMessage(String image) {
        this.image = image;
    }

    @Override
    public void send() {
        System.out.println("Image Message: " + image);
    }
}