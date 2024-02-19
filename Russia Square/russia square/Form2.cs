using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace russia_square
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form1 russian_square = new Form1();
            russian_square.ShowDialog();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form2 game = new Form2();
            game.Close();
            this.Close();
        }

      
    }
}
