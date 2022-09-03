package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {

    //ID
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主キー値を自動生成する
    private Integer id;

    //タスクの内容
    @Column(name = "content", length = 255, nullable = false) // 「nullable = false」 で必須入力（null を許容するか否かの設定）
    private String content;

    //作成日
    @Column(name = "created_at", nullable = false)
    private Timestamp created_at;

    //更新日
    @Column(name = "updated_at", nullable = false)
    private Timestamp updated_at;

    //Idメソッド　SetとGet
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //Contentメソッド　SetとGet
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //作成日メソッド　SetとGet
    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    //更新日メソッド　SetとGet
    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

}
