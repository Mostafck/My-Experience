using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace russia_square
{
    class game
    {
        private static int width=400;
        private static int heght=400;
        private static int x = 5;
        private static int y= 5;
        private static int squaresizex = (width / x+ 2);
        private static int squaresizey = (heght / y + 2);

        
        public static int Width
        {
            get { return width; }
            set { width = value; }
        }
        public static int Heght
        {
            get { return heght; }
            set { heght = value; }
        }
        public static int X
        {
            get { return x; }
            set { x = value; }
        }
        public static int Y
        {
            get { return y; }
            set { y = value; }
        }
        public static int squaresizeX
        {
            get { return squaresizex; }
            set { squaresizex = value; }
        }
        public static int squaresizeY
        {
            get { return squaresizey; }
            set { squaresizey = value; }
        }
    }
}
