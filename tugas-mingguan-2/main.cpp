// Program C++
#include <iostream>

using namespace std;

int main() {
    // Deklarasi variabel
    int nilai_ujian = 75; // Tipe data integer
    cout << "Nilai UAS : " << nilai_ujian << endl;

    // Penggunaan if else
    if (nilai_ujian > 80) {
        cout << "Skor mu adalah A" << endl;
    } else if (nilai_ujian > 70) {
        cout << "Skor mu adalah B" << endl;
    } else if (nilai_ujian > 60) {
        cout << "Skor mu adalah C" << endl;
    } else {
        cout << "Skor mu adalah D" << endl;
    }

    // Array Satu Dimensi
    int arrSatuDimensi[] = {1, 2, 3, 4, 5};

    // For Loop
    for (int i = 0; i < 5; i++) {
        cout << "Elemen ke-" << i << " = " << arrSatuDimensi[i] << endl;
    }

    // Array Multi Dimensi
    int arrMultiDimensi[2][3] = {{2, 3, 5}, {7, 11, 13}};

    // While Loop
    int j = 0;
    while (j < 3) {
        cout << "Array Multi Dimensi [0][" << j << "] = " << arrMultiDimensi[0][j] << endl;
        j++;
    }

    // Do-while Loop
    int k = 0;
    do {
        cout << "Array Multi Dimensi [1][" << k << "] = " << arrMultiDimensi[1][k] << endl;
        k++;
    } while (k < 3);

    // Input
    int input;
    cout << "Masukkan sebuah angka: ";
    cin >> input;

    // Output
    cout << "Anda memasukkan: " << input << endl;

    // Comment -> Ini single line comment
    /* Ini Multi
       Line Comment */

    return 0;
}

