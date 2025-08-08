# Çalışan Yönetim Sistemi

Bu proje, temel veritabanı yönetimi becerilerini pratik bir şekilde uygulamayı amaçlayan basit bir Java konsol uygulamasıdır. `Java`, `Maven` ve `PostgreSQL` teknolojileri kullanılarak geliştirilen bu sistem, 
çalışan verileri üzerinde temel CRUD (Create, Read, Update, Delete) operasyonlarını gerçekleştirmektedir.

## Özellikler

- **Veritabanı Entegrasyonu:** PostgreSQL veritabanına sorunsuz bağlantı kurar.
- **CRUD Operasyonları:** Çalışan kayıtları üzerinde aşağıdaki işlemleri yapar:
  - **Create (Oluşturma):** Veritabanına yeni çalışan ekleme.
  - **Read (Okuma):** Mevcut çalışanların listesini görüntüleme.
  - **Update (Güncelleme):** Bir çalışanın bilgilerini değiştirme (örneğin, maaşını güncelleme).
  - **Delete (Silme):** Bir çalışanı veritabanından kalıcı olarak silme.
- **Dinamik Veri Yönetimi:** Her çalıştırmada temiz bir başlangıç için veritabanı tablosunu sıfırlayarak veri bütünlüğünü korur.

## Kullanılan Teknolojiler

- **Java:** Uygulamanın temel programlama dili.
- **Maven:** Proje bağımlılıklarını ve yaşam döngüsünü yönetmek için kullanılan güçlü bir araç.
- **PostgreSQL:** Veri depolama ve sorgulama için kullanılan güvenilir, açık kaynaklı ilişkisel veritabanı.
- **Docker:** PostgreSQL veritabanının kolayca ve izole bir ortamda çalıştırılmasını sağlar.

## Kurulum ve Çalıştırma

Projeyi yerel makinenizde çalıştırmak için aşağıdaki adımları takip edin:

1.  **PostgreSQL Veritabanını Başlatın:**
    - Docker yüklü olduğundan emin olun.
    - Terminalinizde aşağıdaki komutu çalıştırarak PostgreSQL konteynerini başlatın. Bu, projenizin bağlanacağı veritabanı sunucusunu ayağa kaldırır.
    ```bash
    docker run --name my-postgres -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres
    ```

2.  **Projeyi Derleyin ve Çalıştırın:**
    - Projenin ana dizinine gidin.
    - VS Code içindeki "Run" düğmesi veya terminalde `App.java` dosyasını çalıştırarak uygulamayı başlatın.
    - Uygulama, tüm CRUD operasyonlarını sırasıyla konsol ekranına yazdıracaktır.

---

