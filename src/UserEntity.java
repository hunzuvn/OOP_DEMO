

import java.util.List;

public class UserEntity {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private List<BorrowRecordEntity> borrowRecords;

    public UserEntity() {}

    public UserEntity(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<BorrowRecordEntity> getBorrowRecords() {
        return borrowRecords;
    }

    public void setBorrowRecords(List<BorrowRecordEntity> borrowRecords) {
        this.borrowRecords = borrowRecords;
    }
}