package maze;

public class MazeBuilder
{
    public MazePiece startingPiece = new EmptySpace();
    public MazePiece secondPiece = new EmptySpace();
    public MazePiece thirdPiece = new EmptySpace();
    public MazePiece horizontalWall = new HorizontalWall();
    public MazePiece verticalWall = new VerticalWall();
    public MazePiece beacon = new Beacon();

    public MazePiece buildMaze()
    {
        startingPiece.setNorthMazePiece(secondPiece);
        startingPiece.setEastMazePiece(new VerticalWall());
        startingPiece.setSouthMazePiece(new HorizontalWall());
        startingPiece.setWestMazePiece(new VerticalWall());
        secondPiece.setNorthMazePiece(new HorizontalWall());
        secondPiece.setEastMazePiece(new VerticalWall());
        secondPiece.setSouthMazePiece(startingPiece);
        secondPiece.setWestMazePiece(thirdPiece);
        thirdPiece.setNorthMazePiece(beacon);
        thirdPiece.setEastMazePiece(secondPiece);
        thirdPiece.setSouthMazePiece(new HorizontalWall());
        thirdPiece.setWestMazePiece(new VerticalWall());
        return startingPiece;
    }
}
