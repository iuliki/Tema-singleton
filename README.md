# Tema-singleton



Singleton
Este un design pattern care te asigura ca o clasa are doar o singura instanta, in timp ce ofera un punct de acces global acestei instante. 
 
Singleton rezolva doua probleme in acelasi timp: 
1. Asigura faptul ca o clasa are doar o singura instanta
 
2. Ofera un acces global acelei instante
Te lasa sa accesezi obiecte de oriunde din program si in acelasi timp protejeaza instanta sa fie suprascrisa de alt cod. 
Implementarile Singleton ofera:
-	Constructorul default este privat,pentru a preveni ca alte obiecte sa foloseasca operatorul „new ” in clasa Singleton.
-	Creeaza o metoda statica care se comporta ca un constructor. Se mai numeste si constructorul privat care creeaza un obiect si il salveaza in camp static. Toate call urile catre aceasta metoda returneaza un obiect catched.
Unde se aplica? 
-	Foloseste Singleton pattern atunci cand o clasa in programul tau ar trebui sa aiba doar o singura instanta disponibila la toti clientii, de exemplu un singur obiect dintr-o baza de date impartita la diferite parti din program.
-	Singleton pattern sterge orice alta semnificatie pentru a creea obiecte pentru o clasa exceptand metoda speciala. 
-	Foloseste Singleton pattern cand ai nevoie de control strict asupra variabilelor
Pro and Cons
Pro: 
-	Te asigura ca, clasa are doar o singura instanta
-	Obtii un acces global la acea instanta
-	Obiectul singleton este initiat doar atunci cand este apelat pentru prima data
Cons: 
-	Nu respecta principiul „single responsibility”
-	Poate masca design uri care nu sunt ok atunci cand componentele unui program seamana prea mult intre ele. 
-	Pattern-ul cere tratament special in mediul de lucru ca sa nu creeze obiecte singleton de fiecare data.

