## Seqについて
#### map
- コレクションの各要素に処理を行わせる
#### flatten
- 入れ子になったSeqを解消できる
#### flatMap
- mapとflatttenを合わせたもの
#### find
- 対象コレクションのうち、条件を満たす最初の要素をSomeに入れて返す。ない場合はNoneを返す。引数にはBoolean型を返す関数を渡す。
#### filter
- 対象コレクションのうち、条件を満たす要素だけで構成されたコレクションを返す。一つも条件を満たす要素がない場合は空のコレクションが返される。
##### findとfilter違い
- findはコレクションの中から条件に合致した要素1つを返すのに対し、filterは条件に合致した値を全てコレクションとして返す。
#### collect
- filterとmapを組み合わせたようなメソッド。caseにマッチした要素だけが抽出され、その上で変換された値がコレクションとして返される。
#### collectFirst
- findとmapを組み合わせたようなメソッド。caseにマッチした最初の要素が抽出され、その上で変換された値たOptionに包まれて返ってくる。
#### exists
- コレクションの中に１つでも条件を満たす要素があればtrueを返す。条件を満たさない場合はfalseを返す。
#### contains
- 引数で指定した要素がコレクションに1つでも含まれていれば、trueを1つも含まれていない場合はfalseを返す。
#### empty
- 同じ型の空のコレクションを返す。
#### head
- コレクションの先頭の要素を返す。コレクションがからの場合はOptionのgetと同じく例外を返す。
#### headOption
- コレクションの先頭の値をOption型で返す。コレクションが空の場合はNoneを返す。
#### last
- コレクションの末尾の要素を返す。headの逆ver
#### lastOption
- コレクションの末尾の値をOption型で返す。headOptionの逆。
#### init
- コレクションのうち末尾を除いた残りのコレクションを返す。コレクションが空の場合は例外を返す。
#### tail
- コレクションのうち先頭を除いた残りのコレクションを返す。initの逆。
#### +: :+
- +:は先頭に要素を追加したコレクションを返す。
- :+は末尾に要素を追加したコレクションを返す。
#### ++
- ２つのコレクションを連結したコレクションを返す。
#### Nil
- 空のリストを返す。
#### foldLeft
- 左から順に畳み込み演算を行う。第１引数は初期値、第二引数は実行したい処理。
#### foldRight
- 右から順番に畳み込み演算を行う。foldLeftの逆。
```
例 
Seq(1,2,3,4,5).foldLeft(-7)((a: Int, b: Int) => a - b
// -22
(-7 - 1) -2)-3)-4)-5 = -22

Seq(1,2,3,4,5).foldLRight(-7)((a: Int, b: Int) => a - b
// 10
1-(2-(3-(4-(5-(-7)) = 10


```

