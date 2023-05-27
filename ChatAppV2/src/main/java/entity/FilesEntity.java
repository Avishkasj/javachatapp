package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "files", schema = "encodeor_javachat", catalog = "")
public class FilesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "chat_id")
    private int chatId;
    @Basic
    @Column(name = "link")
    private String link;
    @Basic
    @Column(name = "is_deleted")
    private int isDeleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilesEntity that = (FilesEntity) o;

        if (id != that.id) return false;
        if (chatId != that.chatId) return false;
        if (isDeleted != that.isDeleted) return false;
        if (link != null ? !link.equals(that.link) : that.link != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + chatId;
        result = 31 * result + (link != null ? link.hashCode() : 0);
        result = 31 * result + isDeleted;
        return result;
    }
}
