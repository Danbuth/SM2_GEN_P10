//import org.bouncycastle.pkcs.PKCS10CertificationRequest;
//
//public class MMM {
//
//    public static void main(String[] args) {
//
//        String base64 = "MIIDlTCCAzigAwIBAgIIdMEAxwAXJ0wwDAYIKoEcz1UBg3UFADBSMQswCQYDVQQGEwJDTjEvMC0GA1UECgwmWmhlamlhbmcgRGlnaXRhbCBDZXJ0aWZpY2F0ZSBBdXRob3JpdHkxEjAQBgNVBAMMCVpKQ0EgT0NBMTAeFw0xODA2MjgwNzQxNTJaFw0xOTA2MjgwNzQxNTJaMEUxCzAJBgNVBAYTAkNOMRowGAYDVQQqDBHmtYvor5UgX+enpua1t+i0pDEaMBgGA1UEAwwR5rWL6K+VIF/np6bmtbfotKQwWTATBgcqhkjOPQIBBggqgRzPVQGCLQNCAAQ4Mvy5+CtSHXeAdwVgS8vr6yvdl69vTwBUXb8wzYMP5VwdSe0+A/6Ho5m7pE8SVRX83tHHa8jC2qXkw0thfnFVo4ICATCCAf0wDAYDVR0TBAUwAwEBADAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwQwCwYDVR0PBAQDAgDAMBEGCWCGSAGG+EIBAQQEAwIAgDAeBggqgRzQFAQBAQQSMzYwODIyMTk4NjA5Mjg0MDkxMB8GA1UdIwQYMBaAFKfTsSSQIB09tFTuSzcoUpGuLGoiMIGoBgNVHR8EgaAwgZ0wgZqggZeggZSGgZFsZGFwOi8vbGRhcC56amNhLmNvbS5jbi9DTj1aSkNBIE9DQTEsQ049WkpDQSBPQ0ExLCBPVT1DUkxEaXN0cmlidXRlUG9pbnRzLCBvPXpqY2E/Y2VydGlmaWNhdGVSZXZvY2F0aW9uTGlzdD9iYXNlP29iamVjdGNsYXNzPWNSTERpc3RyaWJ1dGlvblBvaW50MIGiBggrBgEFBQcBAQSBlTCBkjCBjwYIKwYBBQUHMAKGgYJsZGFwOi8vbGRhcC56amNhLmNvbS5jbi9DTj1aSkNBIE9DQTEsQ049WkpDQSBPQ0ExLCBPVT1jQUNlcnRpZmljYXRlcywgbz16amNhP2NBQ2VydGlmaWNhdGU/YmFzZT9vYmplY3RDbGFzcz1jZXJ0aWZpY2F0aW9uQXV0aG9yaXR5MB0GA1UdDgQWBBTcLRRw/UUUeqBPub4PLdJe+ibnfjAMBggqgRzPVQGDdQUAA0kAMEYCIQDq2NTbuIoYx14Ldl1bwHuOfEvJzSoccI8R3NK0S4dh8gIhAKbw2T7B/r9Pr/ygEjHw6Q/dyX7uYftkxdLHZOCP1D8U";
//        int count = base64.length() / 64;
//        if (base64.length() % 64 != 0) {
//            count++;
//        }
//        int offset;
//        StringBuilder certString = new StringBuilder("-----BEGIN CERTIFICATE-----\n");
//        for (offset = 0; offset < count; ++offset) {
//            if (offset != (count - 1)) {
//                certString.append(base64, offset * 64, (offset + 1) * 64);
//            } else {
//                certString.append(base64, offset * 64, base64.length());
//            }
//            certString.append("\n");
//        }
//        certString.append("-----END CERTIFICATE-----");
//
//
//
//        System.out.println(certString.toString());
//    }
//}
