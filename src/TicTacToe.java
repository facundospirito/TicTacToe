import java.util.Arrays;
public class TicTacToe {
    String[][] field = new String[3][3];
    public void newGame(){}
    public void getField(){
        Arrays.fill(field, "-");
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(field[i]));
        }
        public String makeMove(int x, int y){
            char x1 = 'X';
            char o ='O';

            field[x][y] = x1;
            field[x][y] = o;
        }
    }

    //принимающий два параметра — ряд и столбик, куда игрок хочет сделать ход. Если ход невозможен (клетка уже занята), то метод должен вернуть строку
    // вида {Cell x, y is already occupied}. Если же ход возможен, то в поле следует поставить X или 0 (зависит от того, кто сейчас ходил), и вернуть строку
    // Move completed, если после этого хода игра не заканчивается. Если же этим ходом победил один из игроков, то метод должен вернуть строку вида
    // {Player X/0 won}. Если же после этого хода свободных клеток не осталось, а победителя нет, то метод должен вернуть Draw. Если игра уже завершена
    // (выявлен победитель или ничья), но кто-то хочет походить дальше, то метод должен вернуть Game was ended.

}
