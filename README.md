## Gradle の 練習

## ビルドしたい場合

    gradle clean build

## build.gradleをもとに Eclipse の設定を更新したい場合

    gradle eclipse

##  環境別に切り替えたい場合

    gradle clean war -Penv=dev
    gradle clean war -Penv=default


## TODO
-
- Mockitoの まともなサンプルを書く
- 画面テストのサンプルを書く
- ボーリング、ライフゲーム、数独の例を書く
