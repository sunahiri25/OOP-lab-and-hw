# OOP-lab-and-hw
# GIT 
## 1. Git là gì?

__Git__ là một hệ thống quản lý phiên bản phân tán (Distributed Version Control System – DVCS), nó là một trong những hệ thống quản lý phiên bản phân tán phổ biến nhất hiện nay. Git cung cấp cho mỗi lập trình viên kho lưu trữ (repository) riêng chứa toàn bộ lịch sử thay đổi.

## 2. Version Control System – VCS là gì?

- VCS là viết tắt của __Version Control System__ là __hệ thống kiểm soát các phiên bản phân tán mã nguồn mở__. Các VCS sẽ lưu trữ tất cả các file trong toàn bộ dự án và ghi lại toàn bộ lịch sử thay đổi của file. Mỗi sự thay đổi được lưu lại sẽ được và thành một version (phiên bản).
- VCS giúp bạn có thể lưu trữ nhiều phiên bản khác nhau của một mã nguồn được nhân bản (clone) từ một kho chứa mã nguồn (repository), mỗi thay đổi vào mã nguồn trên local sẽ có thể server nơi đặt kho chứa chính.
- Mỗi phiên bản bao gồm: nội dung file bị thay đổi, ngày giờ sửa đổi, người thay đổi là ai, lý do thay đổi hay tên phiên bản,…

## 3. Các thuật ngữ Git quan trọng

### 3.1 Branch

- Các Branch (nhánh) đại diện cho các phiên bản cụ thể của một kho lưu trữ tách ra từ project chính của bạn.
- Branch cho phép bạn theo dõi các thay đổi thử nghiệm bạn thực hiện đối với kho lưu trữ và có thể hoàn nguyên về các phiên bản cũ hơn.

### 3.2 Commit

Một commit đại diện cho một thời điểm cụ thể trong lịch sử dự án của bạn. Sử dụng lệnh commit kết hợp với lệnh git add để cho git biết những thay đổi bạn muốn lưu vào local repository.

### 3.3 Head

Các commit ở đầu của một branch được gọi là head. Nó đại diện cho commit mới nhất của repository mà bạn hiện đang làm việc.

### 3.4 Master

- Master là nhánh chính của tất cả các repository của bạn. Nó nên bao gồm những thay đổi và commit gần đây nhất.
- Đối với github nhánh chính là main

### 3.5 Origin

Origin là phiên bản mặc định của repository. Origin cũng đóng vai trò là bí danh hệ thống để liên lạc với nhánh chính.
Lệnh git push origin master để đẩy các thay đổi cục bộ đến nhánh chính.

### 3.6 Remote

Một Remote (kho lưu trữ từ xa) là một bản sao của một chi nhánh. Remote giao tiếp ngược dòng với nhánh gốc (origin branch) của chúng và các Remote khác trong kho lưu trữ.

### 3.7 Repository

Kho lưu trữ Git chứa tất cả các tệp dự án của bạn bao gồm các branch, tags và commit.

### 3.8 Tags

Tags cung cấp cho bạn một cách để theo dõi các commit quan trọng. Các tags nhẹ chỉ đơn giản đóng vai trò là con trỏ trong khi các tags chú thích được lưu trữ dưới dạng các đối tượng đầy đủ.

## 4. Cách sử dụng cơ bản

### 4.1 Tạo kho lưu trữ (Repository) mới

Để làm việc với Git, trước tiên bạn cần cho nó biết bạn là ai. Bạn có thể đặt tên người dùng của mình bằng lệnh `git config`:

```
git config --global user.name "your name goes here"
```
Khi nó được khởi động, bạn sẽ cần một __repo__ để làm việc. Việc tạo một __repo__ rất đơn giản. Sử dụng lệnh `git init` trong một thư mục:

```
mkdir example
cd example
git init
```

Kiểm tra trạng thái

```
git status
```

Lệnh này sẽ cho bạn biết bạn đang ở branch nào, những file thay đổi chưa được commit.

### 4.2 Thêm file mới

Tạo mới một file, ví dụ `hello.py`. Sau đó kiểm tra trạng thái bằng lệnh

```
git status
On branch master

Initial commit

Untracked files:
  (use "git add <file>..." to include in what will be committed)

   hello.py

nothing added to commit but untracked files present (use "git add" to track)
```

Sử dụng lệnh `git add` để thêm nó vào stage changes.

```
git add ./hello.py
```

### 4.3 Ghi nhận thay đổi

```
git commit -m "creating hello.py"
[master (root-commit) 25b09b9] creating hello.py
 1 file changed, 3 insertions(+)
 create mode 100755 hello.py

git status
On branch master
nothing to commit, working directory clean
```

## 5 Làm việc với kho lưu trữ trên remote

### 5.1 Clone

Sao chép một kho lưu trữ trên `remote` về `local`

```
git clone https://link/to/repo
```

### 5.2 Fetch

Tìm nạp các bản sao và tải xuống tất cả các tệp branch vào máy tính của bạn. Sử dụng nó để lưu các thay đổi mới nhất vào kho lưu trữ của bạn. Nó có thể tìm nạp nhiều branch cùng một lúc.

```
git fetch
```

### 5.3 Đẩy thay đổi lên remote

```
git push
```

### 5.4 Kéo những thay đổi tử remote về

```
git pull
```

### 5.5 Branch

Xem các branch hiện có

```
git branch # Các branch trên local
git branch -r # Các branch trên remote
git branch -a # Các branch ở cả local và remote
```

Chuyển branch

```
git checkout <tên nhánh>
```

Tạo và chuyển sang branch mới

```
git checkout -b <tên nhánh>
```

Chuyển branch trên remote

```
git fetch --all # Tìm nạp nội dung của các nhánh
git checkout <tên nhánh>
```

### 5.6 Log
Lệnh `git log` giúp bạn xem lại thông tin lịch sử `commit`, nhằm giám sát sự thay đổi của dự án. Lệnh `git log` có nhiều tham số để xuất ra, định dạng các thông tin hiện thị theo cách mong muốn. Bạn có thể định dạng cách các thông tin mỗi `commit` được in ra khi xem, cũng như có thể lọc thông tin nào đó.

Mặc đinh thi hành git log nó liệt kê các commit theo thứ tự từ mới nhất đến cũ nhất, mỗi commit có các thông tin gồm: mã hash của commit, dòng thông báo, người tạo commit và ngày tạo commit.

```
git log
```

Khi số lượng log nhiều, nó hiện thị trước một trang log, sau đó có dấu nhắc chờ lệnh để bạn điều hướng, tìm kiếm,… Để có trợ giúp về các lệnh này hãy nhấn h tại dấu nhắc lệnh

Một số phím chức năng bạn có thể nhập đề điều hướng và tìm kiếm trong log như:

- Enter - dòng tiếp theo
- w - trang tiếp
- spacebar - trang trước
- q - thoát
- ?pattern - tìm kiếm, với pattern là mẫu tìm kiếm (keyword)
- /pattern - giống ?pattern
- n - đến vị trí tìm kiếm phía dưới
- N - đến kết quả tìm kiếm phía trước

**Thiết lập hay dùng với git log**

Nếu chỉ muốn hiện thị một số commit log, ví dụ hiện thị log của 2 commit cuối thì cho thêm `-2` vào lệnh

```
git log -2
```

Nếu muốn hiện thị chi tiết các thay đổi của từng commit thì thêm vào tham số `-p`

```
git log -2 -p
```

Nếu hiển thị thống kế gọn hơn về sự thay đổi thì dùng tham số `--stat`, hoặc dạng ngắn gọn hơn là `--shortstat`

```
git log --stat
git log --shortstat
```

Định dạng thông tin chung về commit (mã hash, dòng thông tin) trên một dòng thì dùng tham số `--oneline`

```
git log --oneline
```

### 5.7 Xử lí conflict

```
git pull
Auto-merging hello.py
CONFLICT (content): Merge conflict in hello.py
Automatic merge failed; fix conflicts and then commit the result.
```

Khi thực hiện pull code sẽ có những lúc các bạn gặp tình trạng code ở local và trên remote bị xung đột (conflict) với nhau, xung đột sẽ có dạng:

```
<<<<<<< HEAD
print("Hello!")
=======
print("Hello MIM Pyhton!")
>>>>>>> [branch name]
```

Git đủ tốt để đánh dấu khu vực có vấn đề trong tệp, bao quanh nó bằng `<<<<<<< HEAD` và `>>>>>>> [branch name]`. Nội dung xuất phát sau điểm đánh dấu đầu tiên bắt nguồn từ nhánh làm việc hiện tại. Cuối cùng, một dòng với các ký tự `=======` phân tách hai thay đổi.

Xử lí conflict ta xóa phần không không đúng và giữ lại phần đúng và thực hiện commit như bình thường.

## Quy trình làm việc git đơn giản

1. git status - Đảm bảo răng local của bạn đang sạch sẽ.
2. git pull - Tải phiên bản code mới nhất từ remote.
3. Chỉnh sửa các tệp của bạn.
4. git status - Tìm kiếm tất cả các file đã được thay đổi.
5. git add [file] - Thêm các tệp tin thay đổi vài stage changes.
6. git committ -m "message" - Thực hiện commit của bạn.
7. git push origin - đẩy thay đổi của bạn lên remote.

# GITHUB

## 1. GitHub là gì?

GitHub là một dịch vụ nổi tiếng cung cấp kho lưu trữ mã nguồn Git cho các dự án phần mềm. **Github có đầy đủ những tính năng của Git**, ngoài ra nó còn bổ sung những tính năng về social để các developer tương tác với nhau.

Vài thông tin về GIT:

- Là công cụ giúp quản lý source code tổ chức theo dạng dữ liệu phân tán.

- Giúp đồng bộ source code của team lên một server.

- Hỗ trợ các thao tác kiểm tra source code trong quá trình làm việc (diff, check modifications, show history, merge source, …)

## 2. GitHub cơ bản

### Tạo GitHub Repository

Repository (gọi tắt là repo) là một không gian để lưu trữ dự án của bạn. Do tính chất phân tán của Git, nên có thể hiểu repo là nơi lưu trữ mã nguồn ở cả local và server.

Bạn có thể lưu trữ file code, text, hình ảnh hoặc bất kỳ loại tệp nào trong repo.

Để tạo một repo trên GitHub bạn làm như sau:

- Vào Github, đăng ký một tài khoản bằng cách click vào "Sign up for Github".

- Sau khi đăng ký và kích hoạt thành công. Ấn dấu + trên thanh status bar chọn `New repository`.

![github-1.png](https://mimpython.github.io/assets/images/courses/05-01-github-markdown/github-1.png)

Nhập tên Repositoty và nhấn nút “Create Repository”. Ngoài ra, bạn cũng có thể thêm mô tả cho repo.

![github-2.png](https://mimpython.github.io/assets/images/courses/05-01-github-markdown/github-2.png)

Trong đó, bạn lưu ý 2 options sau:

- Theo mặc định thì repository để là public. Tức là ai cũng có thể xem được repo này của bạn. Nếu dự án của bạn chưa muốn công khai mà chỉ muốn quản lý nội bộ thì chọn Private.

- Bạn có thêm một README file để giới thiệu repo kèm với một file [.gitignore.](https://github.com/github/gitignore) Github đã có sẵn template .gitignore cho bạn, cứ chọn một template phù hợp với mã nguồn dự án là được.

Khi tạo xong, repo sẽ như sau:

![github-3.png](https://mimpython.github.io/assets/images/courses/05-01-github-markdown/github-3.png)

Khi đã có repository, bạn có thể clone, pull, push… source code của mình lên đó.
## Tài liệu tham khảo

Tài liệu chính

- PythonCrashCourse (trang 485-493)
- [Bài viết về git/github](https://realpython.com/python-git-github-intro/) trên trang web Real Python

Tài liệu bổ sung

- [Git Documentation](https://git-scm.com/docs/git#_git_commands)
- [TopDev Git là gì?](https://topdev.vn/blog/git-la-gi/)
