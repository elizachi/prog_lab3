package service;
import characters.Woodcarver;
import exceptions.ComandException;
import exceptions.IllArgRuntimeException;
import interfaces.Messages;
import objects.Mountains;
import objects.PassiveObjects;
import java.util.Objects;
import java.util.Scanner;

// Класс, в котором реализуется интерактив для взаимодействия пользователя и истории.
// В классе возможны выбросы исключений, так как идет взаимодействие с пользователем, где он должен вводить что-либо на консоль
public class Interaction {

    // Метод, запрашивающий у пользователя ввод его имени - никнейма при помощи команты Меня_зовут.
    // При неправильно введении команды, при введении команды без имени, при попытке пропустить нажатием кнопки enter
    // Совершается выброс исключения, и программа рекурсивно возвращает пользовтеля к началу, предлагая попробовать снова
    public void start(){
        System.out.print("Вы начали свое путешествие.\n\n");
        System.out.print("Пробираясь сквозь густую чащу леса вы вышли к заброшенному дому, где повстречали двух мужчин.\n\n");
        System.out.print("Они считают вас подозрительным и требуют вас назвать своё имя. Введите имя используя команду:" +
                " Меня_зовут имя.\n\n");
        try {
            Scanner console = new Scanner(System.in);
            String comand_gamerName = console.nextLine();
            // при нажатии кнопки enter
            if(comand_gamerName.isEmpty()) {
                throw new ComandException("Молчать не очень дружелюбно. Вспомните, в какой вы ситуации:\n");
            }
            else { // при ошибке ввода команды или ввода команды без имени
                if(comand_gamerName.length() < 11) {
                    throw new ComandException("Такой команды не существует. Попробуйте снова.");
                }
                String comand = comand_gamerName.substring(0, 10);
                String gamerName = comand_gamerName.substring(11);
                if (Objects.equals(comand, "Меня_зовут") && gamerName.length() > 10) {
                    System.out.print("Мужчины перед вами представились Уиклсом и Маусоном.\n\n");
                    System.out.print("Ваше имя слишком длинное, они будут звать вас " + gamerName.substring(0, 9) + ".\n\n");
                    System.out.print("Вам по пути, поэтому дальше вы пойдете вместе. Ваша история началась.\n" +
                            "Поведайте нам о ней.\n\n");
                } else if (Objects.equals(comand, "Меня_зовут") && !(gamerName.isEmpty())) {
                    System.out.print("Мужчины перед вами представились Уиклсом и Маусоном.\n\n");
                    System.out.print("Вам по пути, поэтому дальше вы пойдете вместе. Ваша история началась.\n" +
                            "Поведайте нам о ней.\n\n");
                } else {
                    throw new ComandException("Такой команды не существует. Попробуйте снова.");
                }
            }
        } catch(ComandException e) { // ловим исключение, если вдруг а=пользователь ошибся
            // и снова вызываем метод, чтобы можно было начать сначала
            System.err.print(e.getMessage()+"\n\n");
            this.start();
        }
    }

    // Метод, запрашивающий у пользователя вычисления в приведенных примерах.
    // От правильности / неправильности / корректности введенного зависит дальнейшая история.
    public void arithmetic(){
        int isItCorrect = 0;
        System.out.print("Ваши компаньоны заметили, что вы достаточно умны. Они заинтересованы " +
                "в ваших навыках устного счёта.\n Они дали вам карту, посчитайте координаты " +
                "местоположения величественной арки.\n\n");
        System.out.print("Введите ответ в виде целого положительного числа.\n\n");
        System.out.print("180 - 100 + 180 / 90 = ");
        if(test(82)) isItCorrect += 1;
        System.out.print("180 / 30 = ");
        if(test(60)) isItCorrect +=  1;
        System.out.print("180 - (180 / 36 + 180 / 3) = ");
        if(test(115 )) isItCorrect += 1;
        System.out.print("(180 / 6 + 180 / 36)*2 = ");
        if(test(70)) isItCorrect += 1;
        // Если нет ни одной ошибки
        if(isItCorrect == 4){
            System.out.print("Уилкс и Маусон очень рады, что не ошиблись на ваш счёт.\n\n");
        } // Если все что ввел пользователь - ошибка
        else if(isItCorrect == 0){
            System.out.print("Уилкс и Маусон очень разочарованы. Они сообщили вам верные " +
                    "координаты и попросили не путаться под ногами.\n\n");
        } // Если есть хотя бы одна ошибка или хотя бы один правильный ответ
        else{
            System.out.print("Уилкс и Маусон в замешательстве, возможно, у вас ошибка в парочке ответов. " +
                    "Они сообщили вам верные координаты и добавили, что все еще не доверяют вам.\n\n");
        }
    }

    // Метод, использующийся внутри метода arithmetic для проверки корректности введенных пользователем значений
    // При введении символов, отличных от цифр вызывается исключение и программа рекурсивно
    // возвращает пользовтеля к началу, предлагая попробовать снова.
    private boolean test(int correctAnswer){
        try {
            Scanner console = new Scanner(System.in);
            String answer = console.next();
            if(answer.isEmpty()) {
                throw new ComandException("Не молчите, дайте ответ.");
            }
            else {
                for (int i = 0; i < answer.length(); i++){
                    if(answer.charAt(i) >= '0' && answer.charAt(i) <= '9'){}
                    else {
                        throw new IllArgRuntimeException("Ваш ответ не должен содержать буквы и иные посторонние символы, только цифры.");
                    }
                }
                return Integer.parseInt(answer) == correctAnswer;
            }
        } catch(ComandException | IllArgRuntimeException e) {
            System.err.print(e.getMessage()+"\n\n");
            this.test(correctAnswer);
        }
        return true;
    }

    // Метод, предлагающий пользователю поспорить с Древними резчиками по дереву.
    // При желании можно пропустить диалог, нажав кнопку enter. В ином случае предлагается использовать команду выше.
    // При неправильно введении команды свершается выброс исключения, и программа рекурсивно
    // возвращает пользовтеля к началу, предлагая попробовать снова
    public void dialog(Woodcarver woodcarver, Mountains range, Messages messages) throws ComandException {
        System.out.print("\n\nВы и ваши компаньоны вступили в диалог с древними резчиками по дереву.\n" +
                "Как вы считаете, что выше: Гималаи или эти хребты?\n");
        System.out.print("Для того, чтобы ответить на вопрос, введите команду в формате: цифра выше\n" +
                "1 - Гималаи\n" +
                "2 - эти хребты\n" +
                "Чтобы пропустить диалог нажмите enter\n");
        try {
            Scanner console = new Scanner(System.in);
            String comand = console.nextLine();
            if(comand.isEmpty()) {
                System.out.print("Вы решили не разговаривать с древними резчиками по дереву и ушли. " +
                        "Поведайте, что было дальше.\n\n");
                PassiveObjects cha = new PassiveObjects("нам вслед", "");
                Mountains anotherMountain = new Mountains("хребту", "другому", messages);
                woodcarver.assure(cha, range, anotherMountain, "кричали" ,true);
            }
            else if(Objects.equals(comand, "1 выше")){
                System.out.print("- Ответили вы.\n");
                PassiveObjects cha = new PassiveObjects("вас", "");
                Mountains anotherMountain = new Mountains("Гималаям", "великим", messages);
                woodcarver.assure(cha, range, anotherMountain, "уверяют",false);
            }
            else if(Objects.equals(comand, "2 выше")){
                System.out.print("- Ответили вы.\n");
                PassiveObjects cha = new PassiveObjects("вас", "");
                Mountains anotherMountain = new Mountains("Гималаям", "великим", messages);
                woodcarver.assure(cha, range, anotherMountain, "уверяют", true);
            }
            else {
                throw new ComandException("");
            }
        } catch(ComandException e) {
            System.err.print("Такой команды не существует. Попробуйте снова.\n\n");
            this.dialog(woodcarver, range, messages);
        }
    }
}
