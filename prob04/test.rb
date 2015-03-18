

xs = (0..100).to_a.shuffle
inputs = xs[1..100]
STDERR.puts "answer: #{xs[0]}"
inputs.each{|i|
  puts i
}
