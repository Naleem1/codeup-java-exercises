import rpg.Monster;

import java.util.Arrays;

public class ArraysLecture {

    public static Monster[] addMonster(Monster[] monstersArray, Monster newMonster){
        Monster[] newMonsterArray = Arrays.copyOf(monstersArray, monstersArray.length + 1);
        newMonsterArray[newMonsterArray.length-1] = newMonster;
        return newMonsterArray;
    }

    public static void main(String[] args) {

//        int sizeOfArray = 5;

        // array variable declaration
        int[] numbers = new int[5];
        numbers[0] = 42;
        numbers[1] = 567;
        numbers[2] = 457;
        numbers[3] = -560;
        numbers[4] = 1267;

        Arrays.sort(numbers);
//        for (int number : numbers) {
//            System.out.println(number);
//        }


        // array initializer syntax
        int[] moreNumbers = {45, 56, 67, 78};

//        System.out.println(moreNumbers[2]);
//        System.out.println(numbers[2]);

        // Enhanced for loop:
        // for (data-type-of-element variableName :
        // what we're looping over
        // "Loop over the numbers array
        // On each loop, pull out an int element and
        // call it 'number'"
//      for (int number : numbers) {
//          number *= number;
//          System.out.println(number);
//      }

        // For loop

//        for (int i = 0; i < moreNumbers.length; i++){
//            System.out.printf("The number at index %d is %d%n", i, moreNumbers[i]);
//        }

        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);

        Monster[] monsters = {orc, ogre, blueDragon};

        Monster cloaker = new Monster("Cloaker", 14, 78, 10);
        Monster[] newMonsterArray = ArraysLecture.addMonster(monsters, cloaker);
        for (Monster monster : newMonsterArray){
            System.out.println(monster.getName());
        }

//    for (Monster monster : monsters){
//        System.out.printf("%s has %d hit points%n", monster.getName(), monster.getHitPoints());
//    }




    }
}
