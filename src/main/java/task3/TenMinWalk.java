package task3;

public class TenMinWalk {
    int[][] map = new int[21][21];
    int x, y = 11;

    public boolean isValid(char[] walk) {
        return isIReturned(walk) && isItsCostTenMinutes(walk.length);
    }

    private boolean isIReturned(char[] walk) {
        map[x][y] = 1;
        for (char command : walk) {
            chooseDirection(command);
        }

        boolean result;

        try {
            result = map[x][y] == map[11][11];
        } catch (IndexOutOfBoundsException e) {
            result = false;
        }
        x = 11;
        y = 11;
        return result;
    }

    private void chooseDirection(char command) {
        switch (command) {
            case 'e':
                x++;
                break;
            case 'w':
                x--;
                break;
            case 's':
                y++;
                break;
            case 'n':
                y--;
                break;
            default:
                throw new IllegalArgumentException("unknown direction " + command);

        }
    }

    public boolean isItsCostTenMinutes(int length) {
        return length == 10;
    }
}