package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {

    val firstName: String = "Ray"
    val middleName: String = "Abra"
    val lastName: String = "Arsandani"
    val age: Int = 21 // Ubah nilai sesuai umur Anda
    val isSingle: Boolean = true // Ganti dengan status pernikahan Anda

    // Cetak setiap variabel ke layar
    println("First Name: $firstName")
    println("Middle Name : $middleName")
    println("Last Name : $lastName")
    println("Umur: $age years old")
    println("Status: ${if (isSingle) "Single" else "Tidak Single"}")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group Name: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")

    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */

fun myTeam(): List<Any> {
    val teamMembers = listOf("Ray Abra","Desi Deria", "Elfan Ulil",  "Aditya","Ahmad")
    println("My team members: $teamMembers")
    return listOf()
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kak Pupu", "Kak Joy", "Mentor3")
    val countOfGroup = arrayOf("Ray Abra","Desi Deria", "Elfan Ulil",  "Aditya","Ahmad")

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = "Codenesia"
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Codenesia", listOf("Aditya", "Elfan", "Desi", "Ray","Ahmad"), "Morning")

}