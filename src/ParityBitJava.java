public class ParityBitJava {
    public boolean validateClientNumber(String clientNumber) {

        if (clientNumber.length() != 10) {
            return false;
        }

        for (char ch : clientNumber.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        String binaryRepresentation = Long.toBinaryString(Long.parseLong(clientNumber));

        long onesCount = binaryRepresentation.chars().filter(ch -> ch == '1').count();

        return onesCount % 2 == 0;
    }

}
