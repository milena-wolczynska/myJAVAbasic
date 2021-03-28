public class ConditionalStatements {
    public static void main(String[] args) {
        float temperature = 36.4f;
        if (temperature >= 37.0f) {
            System.out.print("Masz gorączkę/stan podgorączkowy!");
        } else if (temperature >= 36.6f && temperature < 37.0f) {
            System.out.print("Jesteś zdrowa/zdrowy!");
        } else{
            System.out.print("Jesteś osłabiona/osłabiony!");
        }
    }
}
