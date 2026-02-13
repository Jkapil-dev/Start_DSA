package DSA.Arrays.Qustions;

public class DefangingIPAddress {
    public String defangIPaddr(String address) {
        String[] addressArray=address.split(".");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < addressArray.length; i++) {
            result.append(addressArray[i]+"[.]");
        }
        return result.toString();
//        return address.replace(".", "[.]");//only this will return answer
    }
}
