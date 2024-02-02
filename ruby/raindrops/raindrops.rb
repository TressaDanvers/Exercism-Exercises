class Raindrops
  # @return [String]
  def self.convert(i)
    running = ""
    running += "Pling" if i % 3 == 0
    running += "Plang" if i % 5 == 0
    running += "Plong" if i % 7 == 0
    running.empty? ? String(i) : running
  end
end