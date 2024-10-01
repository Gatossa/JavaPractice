public class operatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue=true;
        boolean secondValue=false;
        boolean thirdValue=false;
        boolean fourthValue=true;


        System.out.println(firstValue&&secondValue);
        System.out.println(firstValue&&fourthValue);
        System.out.println(secondValue&&thirdValue);

        System.out.println(firstValue||secondValue);
        System.out.println(firstValue||fourthValue);
        System.out.println(secondValue||thirdValue);

        System.out.println(!firstValue); //false
        System.out.println(!thirdValue); //true
        System.out.println(!(firstValue&&secondValue)); //true

    }
}
