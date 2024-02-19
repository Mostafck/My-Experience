using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Drawing;
namespace russia_square
{
    class number_of_squares
    {
        square[,] squares;
        square[,] tempsqures;
        Color[] colors;
        square singlesquare;
        Random randomcolor;
        Color tempcolor;
        public number_of_squares()
        {
            singlesquare = new square();
            squares = new square[game.X, game.Y];
            colors = new Color[game.X];
            randomcolor = new Random();
            for (int i = 0; i < squares.GetLength(0); i++)
            {
                for (int j = 0; j < squares.GetLength(1); j++)
                {
                    squares[i, j] = new square();
                }
            }
            for (int i = 0; i < colors.Length; i++)
            {
                colors[i] = System.Drawing.Color.FromArgb(randomcolor.Next(255), randomcolor.Next(255), randomcolor.Next(255));

            }
        }
        public void creatsquare()
        {
            for (int i = 0; i < squares.GetLength(0); i++)
            {
                for (int j = 0; j < squares.GetLength(1); j++)
                {
                    squares[i, j].squarePIC.Location = new Point(((i + 1) * game.squaresizeX), ((j + 1) * game.squaresizeY));
                    squares[i, j].squarePIC.BackColor = colors[randomcolor.Next(colors.Length)];
                    squares[i, j].squarePIC.Size = new Size(game.squaresizeX, game.squaresizeY);
                    squares[i, j].squarePIC.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
                }
            }
        }
        public void printasquare()
        {
            for (int i = 0; i < squares.GetLength(0); i++)
            {
                for (int j = 0; j < squares.GetLength(1); j++)
                {
                    Form1.mainPANEL.Controls.Add(squares[i, j].squarePIC);
                }
            }
        }
        public void creatsinglesquare()
        {
            singlesquare.squarePIC.Location = new Point(0, 0);
            singlesquare.squarePIC.BackColor = colors[randomcolor.Next(colors.Length)];
            singlesquare.squarePIC.Size = new Size(game.squaresizeX, game.squaresizeY);
            singlesquare.squarePIC.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
        }
        public void printsinglesquar()
        {
            Form1.mainPANEL.Controls.Add(singlesquare.squarePIC);
        }
        public void movesinglesquar(string key)
        {
            if (key == "Up")
            {
                if (singlesquare.squarePIC.Location.X == 0 || singlesquare.squarePIC.Location.X == ((game.X + 1) * game.squaresizeX))
                {
                    if (singlesquare.squarePIC.Location.Y != 0)
                    {
                        singlesquare.squarePIC.Location = new Point(singlesquare.squarePIC.Location.X, singlesquare.squarePIC.Location.Y - game.squaresizeY);
                    }
                }
                else
                {
                    if (singlesquare.squarePIC.Location.Y == (game.Y + 1) * game.squaresizeY && singlesquare.squarePIC.Location.X > 0 && singlesquare.squarePIC.Location.X < (7 * game.squaresizeX))
                    {
                        for (int i = 0; i < game.X; i++)
                        {
                            for (int j = 0; j < game.Y; j++)
                            {
                                if (squares[i, j].squarePIC.Location.X == singlesquare.squarePIC.Location.X)
                                {
                                    tempcolor = singlesquare.squarePIC.BackColor;
                                    singlesquare.squarePIC.BackColor = squares[i, j].squarePIC.BackColor;
                                    for (int k = 0; k < game.Y - 1; k++)
                                    {
                                        squares[i, k].squarePIC.BackColor = squares[i, k + 1].squarePIC.BackColor;
                                    }
                                    squares[i, game.Y - 1].squarePIC.BackColor = tempcolor;
                                    singlesquare.squarePIC.Location = new Point(singlesquare.squarePIC.Location.X, 0);
                                    printasquare();
                                    break;
                                }
                            }
                        }
                    }
                }

            }
            if (key == "Down")
            {
                if (singlesquare.squarePIC.Location.X == 0 || singlesquare.squarePIC.Location.X == ((game.X + 1) * game.squaresizeX))
                {
                    if (singlesquare.squarePIC.Location.Y != ((game.Y + 1) * game.squaresizeY))
                    {
                        singlesquare.squarePIC.Location = new Point(singlesquare.squarePIC.Location.X, singlesquare.squarePIC.Location.Y + game.squaresizeY);
                    }
                }
                else
                {
                    if (singlesquare.squarePIC.Location.Y == 0 && singlesquare.squarePIC.Location.X > 0 && singlesquare.squarePIC.Location.X < (7 * game.squaresizeX))
                    {
                        for (int i = game.X - 1; i >= 0; i--)
                        {
                            for (int j = game .Y - 1; j >= 0; j--)
                            {
                                if (squares[i, j].squarePIC.Location.X == singlesquare.squarePIC.Location.X)
                                {
                                    tempcolor = singlesquare.squarePIC.BackColor;
                                    singlesquare.squarePIC.BackColor = squares[i, j].squarePIC.BackColor;
                                    for (int k = game.Y - 1; k > 0; k--)
                                    {
                                        squares[i, k].squarePIC.BackColor = squares[i, k - 1].squarePIC.BackColor;
                                    }
                                    squares[i, 0].squarePIC.BackColor = tempcolor;
                                    singlesquare.squarePIC.Location = new Point(singlesquare.squarePIC.Location.X, (game.Y + 1) * game.squaresizeY);
                                    printasquare();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (key == "Left")
            {
                if (singlesquare.squarePIC.Location.Y == 0 || singlesquare.squarePIC.Location.Y == ((game.Y + 1) * game.squaresizeY))
                {
                    if (singlesquare.squarePIC.Location.X != 0)
                    {
                        singlesquare.squarePIC.Location = new Point(singlesquare.squarePIC.Location.X - game.squaresizeX, singlesquare.squarePIC.Location.Y);
                    }
                }
                else
                {
                    if (singlesquare.squarePIC.Location.X == (game.X + 1) * game.squaresizeX && singlesquare.squarePIC.Location.Y > 0 && singlesquare.squarePIC.Location.Y < (7 * game.squaresizeY))
                    {
                        for (int i = 0; i < game.Y; i++)
                        {
                            for (int j = 0; j < game.X; j++)
                            {
                                if (squares[j, i].squarePIC.Location.Y == singlesquare.squarePIC.Location.Y)
                                {
                                    tempcolor = singlesquare.squarePIC.BackColor;
                                    singlesquare.squarePIC.BackColor = squares[j, i].squarePIC.BackColor;
                                    for (int k = 0; k < game.X - 1; k++)
                                    {
                                        squares[k, i].squarePIC.BackColor = squares[k + 1, i].squarePIC.BackColor;
                                    }
                                    squares[game.X - 1, i].squarePIC.BackColor = tempcolor;
                                    singlesquare.squarePIC.Location = new Point(0, singlesquare.squarePIC.Location.Y);
                                    printasquare();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (key == "Right")
            {
                if (singlesquare.squarePIC.Location.Y == 0 || singlesquare.squarePIC.Location.Y == ((game.Y + 1) * game.squaresizeY))
                {
                    if (singlesquare.squarePIC.Location.X != ((game.X + 1) * game.squaresizeX))
                    {
                        singlesquare.squarePIC.Location = new Point(singlesquare.squarePIC.Location.X + game.squaresizeX, singlesquare.squarePIC.Location.Y);
                    }
                }
                else
                {
                    if (singlesquare.squarePIC.Location.X == 0 && singlesquare.squarePIC.Location.Y > 0 && singlesquare.squarePIC.Location.Y < (7 * game.squaresizeY))
                    {
                        for (int i = game.Y - 1; i >= 0; i--)
                        {
                            for (int j = game.X - 1; j >= 0; j--)
                            {
                                if (squares[j, i].squarePIC.Location.Y == singlesquare.squarePIC.Location.Y)
                                {
                                    tempcolor = singlesquare.squarePIC.BackColor;
                                    singlesquare.squarePIC.BackColor = squares[j, i].squarePIC.BackColor;
                                    for (int k = game.X - 1; k > 0; k--)
                                    {
                                        squares[k, i].squarePIC.BackColor = squares[k - 1, i].squarePIC.BackColor;
                                    }
                                    squares[0, i].squarePIC.BackColor = tempcolor;
                                    singlesquare.squarePIC.Location = new Point((game.Y + 1) * game.squaresizeY, singlesquare.squarePIC.Location.Y);
                                    printasquare();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        public int checkrow()
        {
            Color tempcolor;
            int count;
            for (int i = 0; i < game.X; i++)
            {
                count = 0;
                tempcolor = squares[i, 0].squarePIC.BackColor;
                for (int j = 0; j < game.Y; j++)
                {
                    if (tempcolor==squares[i,j].squarePIC.BackColor)
                    {
                        count++;
                        if (count==game.Y)
                        {
                            game.X--;
                            return i;
                        }

                    }
                }
            }
            return -1;
        }
        public int checkcolumn()
        {
            Color tempcolor;
            int count ;
            for (int i = 0; i < game.Y; i++)
            {
                count = 0;
                tempcolor = squares[0, i].squarePIC.BackColor;
                for (int j = 0; j < game.X; j++)
                {
                    if (tempcolor == squares[j, i].squarePIC.BackColor)
                    {
                        count++;
                        if (count == game.X)
                        {
                            game.Y--;
                            return i;
                        }

                    }
                }
            }
            return -1;
        }
        public void removerow(int x,string key)
        {
            tempsqures = new square[game.X+1, game.Y ];
            tempsqures = squares;
            squares = new square[game.X, game.Y];
            for (int i = 0; i < game.X; i++)
            {
                for (int j = 0; j < game.Y; j++)
                {
                    if (i<x)
                    {
                        squares[i, j] = tempsqures[i, j];
                    }
                    else
                    {
                        squares[i, j] = tempsqures[i+1,j];
                        squares[i, j].squarePIC.Location = new Point(squares[i, j].squarePIC.Location.X - game.squaresizeX, squares[i, j].squarePIC.Location.Y);
                    }
                }
            }
            if (key=="Right")
            {
                singlesquare.squarePIC.Location = new Point((game.X + 1) * game.squaresizeX, singlesquare.squarePIC.Location.Y);
            }
            if (key=="Left")
            {
                singlesquare.squarePIC.Location = new Point(0, singlesquare.squarePIC.Location.Y);
            }
            Form1.mainPANEL.Controls.Clear();
            printsinglesquar();
            printasquare();
        }
        public void removecolumn(int y, string key)
        {
            tempsqures = new square[game.X, game.Y+1];
            tempsqures = squares;
            squares = new square[game.X, game.Y];
            for (int i = 0; i < game.Y; i++)
            {
                for (int j = 0; j < game.X; j++)
                {
                    if (i<y)
                    {
                        squares[j, i] = tempsqures[j, i+1];
                    }
                    else
                    {
                        squares[j, i] = tempsqures[j, i+1];
                        squares[j, i].squarePIC.Location = new Point(squares[j, i].squarePIC.Location.X, (squares[j, i].squarePIC.Location.Y - game.squaresizeY));
                    }
                }
            }
            if (key=="Up")
            {
                singlesquare.squarePIC.Location = new Point(singlesquare.squarePIC.Location.X, 0);
            }
            if (key == "Down")
            {
                singlesquare.squarePIC.Location = new Point(singlesquare.squarePIC.Location.X, (game.Y+ 1) * game.squaresizeY);
            }
            Form1.mainPANEL.Controls.Clear();
            printsinglesquar();
            printasquare();
        }
    }
}
