class MessageFactory {
    public Message createMessage(String messageType, String content) {
        if ("text".equalsIgnoreCase(messageType)) {
            return new TextMessage(content);
        } else if ("image".equalsIgnoreCase(messageType)) {
            return new ImageMessage(content);
        } else if ("audio".equalsIgnoreCase(messageType)) {
            return new AudioMessage(content);
        } else {
            throw new IllegalArgumentException("Invalid message type");
        }
    }
}