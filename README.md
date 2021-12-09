<div id="top"></div>
<!-- PROJECT LOGO -->
<br />
<div align="center">
<a href="https://imgbb.com/"><img src="https://i.ibb.co/DV2kSym/ss.png" alt="ss" border="0"></a><br /><a target='_blank' href='https://id.imgbb.com/'></a><br />
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project
- Nama : Fazil Basri
- NIM : 1908107010032
- Menggunakan Pattern genap (2), satu pattern ganjil

### Financial Planning
  Financial Planning adalah projek yang memberikan informasi terkait Kurs Harian berbagai negara ke Rupiah menggunakan implementasi `Observer Pattern`. Projek ini juga menggunakan implementasi `Decorator Pattern`  untuk menu melihat daftar biaya penggunaan CC dan Asuransi jiwa dari bank. Dan penggunaan `Adapter Pattern` pada menu konversi kurs.

Menu yang terdapat dalam projek:
* Informasi Kurs Harian -> memberikan informasi kurs berbagai negara ke Rupiah.
* Pilihan Tabungan -> memberikan informasi biaya penggunaan dari penawaran bank, CC dan Asuransi Jiwa.
* Konversi kurs -> mengkonversi jumlah inputan mata uang asing ke rupiah.

<p align="right">(<a href="#top">back to top</a>)</p>


## Package dan File

Dalam projek ini terdapat beberapa package yang dipisahkan menurut pattern yang digunakan, diantaranya :
  1. File Utama/Main -> FinancialPlanning.java (File yang akan di Run)
  2. Decorator -> Berisi file decorator pattern
      - File Main -> MainDec.java
  3. Observer -> Berisi file Observer pattern 
      - File main -> MainObs.java
  4. Adapter Pattern -> Berisi file Adapter Pattern
      - File main -> MainAdp
  
<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started
_Dibawah ini petunjuk requitments dan instalasi projek_ 

### Prerequisites
* Java JDK
* Git Bash / cmd
* text editor / IDE

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/xzill11/UAS-Praktikum-APL-2021.git
   ```
3. Buka gitbash di folder `UAS-Praktikum-APL-2021` dan compile
   ```sh
   javac FinancialPlanning.java;
   ```
4. Run code yang telah di compile
   ```sh
   java FinancialPlanning;
   ```

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- ROADMAP -->
## Roadmap

- [x] Decorator pattern
- [x] Observer Pattern
- [x] Adapater Pattern 
- [x] Main menu
- [x] Documentations code
- [x] Readme. md
<p align="right">(<a href="#top">back to top</a>)</p>
<!-- CONTACT -->

## Contact

Fazil Basri - [Fazillbasry@gmail.com]()

Project Link: [https://github.com/xzill11/UAS-Praktikum-APL-2021](https://github.com/xzill11/UAS-Praktikum-APL-2021)

<p align="right">(<a href="#top">back to top</a>)</p>

