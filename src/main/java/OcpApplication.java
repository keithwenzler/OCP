public class OcpApplication {

    private static final String STRAIN_CORRELATION_IDENTIFIER_BEGIN = "<StrainCorrelationIdentifier>";
    private static final String STRAIN_CORRELATION_IDENTIFIER_END = "</StrainCorrelationIdentifier>";

    public static void main(String[] args) {

        String s1 = "<test><blah1>blah</blah1><blah2>blahblah</blah2></test>";
        s1 = "Raw<StrainCorrelationIdentifier></StrainCorrelationIdentifier>";
//        int i1 = s1.indexOf("<blah2>");
//        int i2 = s1.indexOf("</blah2>") + 8;
//        System.out.println(i1);
//        System.out.println(i2);
//        s1 = s1.substring(0, i1) + s1.substring(i2);
//        System.out.println(s1);


        int length = STRAIN_CORRELATION_IDENTIFIER_END.length();
        int start = s1.indexOf(STRAIN_CORRELATION_IDENTIFIER_BEGIN);
        int end = s1.indexOf(STRAIN_CORRELATION_IDENTIFIER_END) + length;
        end = s1.indexOf(STRAIN_CORRELATION_IDENTIFIER_END) + STRAIN_CORRELATION_IDENTIFIER_END.length();
        System.out.println(start);
        System.out.println(end);
        System.out.println(length);
        StringBuilder sb1 = new StringBuilder(s1);
//        sb1.delete(s1.indexOf("<blah2>"), s1.indexOf("</blah2>") + 8);
        sb1.delete(start, end);
        System.out.println(sb1.toString());

    }

}
