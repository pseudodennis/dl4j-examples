package connect4ever;

import java.util.Random;

public class C4CPU
{
    public C4CPU() {
        }

    public int move(int[][] playerBoard) {

        Random rand = new Random();
        int colPick = rand.nextInt(7);

        do
        {
            colPick = rand.nextInt(7);

        } while (playerBoard[0][colPick] != 0);



        System.out.println(colPick);
        return colPick;
    }

}
