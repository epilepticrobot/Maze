//Copyright © Cody Morrin 2012
package maze;

public class UndefinedPiece implements MazePiece
{

    private UndefinedPiece()
    {
    }

    public static UndefinedPiece getInstance()
    {
        return UndefinedPieceHolder.INSTANCE;
    }

    @Override
    public MazePiece getNorthMazePiece()
    {
        throw new UnsupportedOperationException("Cant get from undefined maze piece");
    }

    @Override
    public void setNorthMazePiece(MazePiece mazePiece)
    {
        throw new UnsupportedOperationException("Cant set from undefined maze piece");
    }

    @Override
    public MazePiece getEastMazePiece()
    {
        throw new UnsupportedOperationException("Cant get from undefined maze piece");
    }

    @Override
    public void setEastMazePiece(MazePiece mazePiece)
    {
        throw new UnsupportedOperationException("Cant set from undefined maze piece");
    }

    @Override
    public MazePiece getSouthMazePiece()
    {
        throw new UnsupportedOperationException("Cant get from undefined maze piece");
    }

    @Override
    public void setSouthMazePiece(MazePiece mazePiece)
    {
        throw new UnsupportedOperationException("Cant set from undefined maze piece");
    }

    @Override
    public MazePiece getWestMazePiece()
    {
        throw new UnsupportedOperationException("Cant get from undefined maze piece");
    }

    @Override
    public void setWestMazePiece(MazePiece mazePiece)
    {
        throw new UnsupportedOperationException("Cant set from undefined maze piece");
    }

    private static class UndefinedPieceHolder
    {

        private static final UndefinedPiece INSTANCE = new UndefinedPiece();
    }
}
