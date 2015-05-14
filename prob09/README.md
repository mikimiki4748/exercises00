#問題09 シーザー暗号
シーザー暗号を解読するプログラムを作成せよ
暗号文とキーワードを標準入力として、解読結果を出力せよ

シーザー暗号(カエサル暗号ともいう)とは、単一換字式暗号の一種で、文章内の文字を辞書順にある個数シフトして作った暗号である。
(この問いでは辞書順を,"abcdefghijklmnopqrstuvwxyz,.' "(z以降は、コロン、ピリオド、シングルクォーテーション、スペース) とする)
また、辞書順の最後の文字の続きは先頭にループする
例えば、シフト数を'5'とすれば'a'->'f','k'->'p','z'->'a'というように変換される

また、原文には特定の文字列(キーワード)を含む
いい変えれば、キーワードを含むような文章に変換すればよい

(文字は全て小文字である)

例題
暗号文:
vlro,qfjb,fp,ifjfqbax,pl,alkzq,t.pqb,fq,ifsfkd,pljblkb,bipbzp,ifcby,alkzq,'b,qo.mmba,'v,aldj.x,tef e,fp,ifsfkd,tfqe,qeb,obpriqp,lc,lqebo,mblmibzp,qefkhfkdy,alkzq,ibq,qeb,klfpb,lc,lqebopz,lmfkflkp,aoltk,lrq,vlro,ltk,fkkbo,slf by,.ka,jlpq,fjmloq.kqx,e.sb,qeb, lro.db,ql,cliilt,vlro,eb.oq,.ka,fkqrfqflky,qebv,pljbelt,.iob.av,hklt,te.q,vlr,qoriv,t.kq,ql,'b ljby,bsbovqefkd,bipb,fp,pb lka.ovy

キーワード:
everything


解読結果:
your time is limited, so don't waste it living someone else's life. don't be trapped by dogma, which is living with the results of other people's thinking. don't let the noise of others' opinions drown out your own inner voice. and most important, have the courage to follow your heart and intuition. they somehow already know what you truly want to become. everything else is secondary.
(この文章はキーワードの'everythig'を含む)


[参考]http://lecture.ecc.u-tokyo.ac.jp/~yamaguch/cp1-6/kadai6b.html
(注)参考のページとは文字列が若干異なる
