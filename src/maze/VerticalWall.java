//Copyright © Cody Morrin 2012
package maze;

public class VerticalWall implements MazePiece
{

    private MazePiece northPiece = UndefinedPiece.getInstance();
    private MazePiece eastPiece = UndefinedPiece.getInstance();
    private MazePiece southPiece = UndefinedPiece.getInstance();
    private MazePiece westPiece = UndefinedPiece.getInstance();

    @Override
    public MazePiece getNorthMazePiece()
    {
        return northPiece;
    }

    @Override
    public void setNorthMazePiece(MazePiece mazePiece)
    {
        northPiece = mazePiece;
    }

    @Override
    public MazePiece getEastMazePiece()
    {
        return eastPiece;
    }

    @Override
    public void setEastMazePiece(MazePiece mazePiece)
    {
        eastPiece = mazePiece;
    }

    @Override
    public MazePiece getSouthMazePiece()
    {
        return southPiece;
    }

    @Override
    public void setSouthMazePiece(MazePiece mazePiece)
    {
        southPiece = mazePiece;
    }

    @Override
    public MazePiece getWestMazePiece()
    {
        return westPiece;
    }

    @Override
    public void setWestMazePiece(MazePiece mazePiece)
    {
        westPiece = mazePiece;
    }
}
