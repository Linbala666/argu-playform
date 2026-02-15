# argu-playform (Spring Boot 3 + Java 17)

后端联调骨架（不依赖数据库）。

## 目录结构（按标准 Java + Maven）
```text
argu-playform/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    ├── main/
    │   ├── java/com/argu/playform/
    │   │   ├── PlayformApplication.java
    │   │   ├── common/              # 通用返回/全局异常
    │   │   ├── controller/          # 接口入口层
    │   │   ├── service/             # 业务逻辑层（当前为 mock）
    │   │   ├── dto/                 # 请求/响应对象
    │   │   └── enums/               # 业务枚举
    │   └── resources/
    │       └── application.yml
    └── test/
        └── java/com/argu/playform/
            └── PlayformApplicationTests.java
```

## 已覆盖接口
- `POST /auth/login`
- `POST /product/save`
- `GET /product/list`
- `GET /product/recommend_planting`
- `POST /order/create`
- `GET /order/list`
- `POST /trace/add_node`
- `GET /trace/detail`
- `POST /live/start`
- `GET /live/feed`
- `POST /finance/apply_loan`
- `GET /gov/loan/audit_list`
- `POST /community/demand/post`
- `GET /gov/stats/dashboard`
- `POST /ai/task/create`

## 本地启动
```bash
mvn spring-boot:run
```

Base URL: `http://localhost:8080/api/v1`

## 上传到你的 GitHub 仓库（按该目录结构）
> 如果你本地已 clone 本仓库，只需要配置远程并 push。

```bash
# 1) 绑定你的 GitHub 仓库地址（HTTPS 或 SSH 二选一）
git remote add origin https://github.com/<your-name>/<your-repo>.git
# 或：git remote add origin git@github.com:<your-name>/<your-repo>.git

# 2) 推送当前分支
git push -u origin work
```

如果你的默认分支是 `main`，可改成：
```bash
git push -u origin HEAD:main
```
