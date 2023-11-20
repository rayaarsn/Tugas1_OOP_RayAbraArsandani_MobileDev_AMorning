package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    try {
        // Contoh list
        val angkaList = listOf(1, 2, 3, 4, 5)

        // Mencoba membaca elemen dari indeks yang tidak valid
        val nilai = angkaList[10]

        // Jika berhasil, mencetak nilai
        println("Nilai di indeks 10: $nilai")

    } catch (e: IndexOutOfBoundsException) {
        // Menangani kesalahan jika indeks tidak valid
        println("Indeks tidak valid. Mohon periksa kembali list Anda.")
    }
}

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini


