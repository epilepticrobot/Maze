//Copyright © Cody Morrin 2012
package maze;

public interface MazePiece
{
    public MazePiece getNorthMazePiece();
    public void setNorthMazePiece(MazePiece mazePiece);
    public MazePiece getEastMazePiece();
    public void setEastMazePiece(MazePiece mazePiece);
    public MazePiece getSouthMazePiece();
    public void setSouthMazePiece(MazePiece mazePiece);
    public MazePiece getWestMazePiece();
    public void setWestMazePiece(MazePiece mazePiece);
}
